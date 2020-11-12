# SysML1.6
A Papyrus DSML for the SysML 1.6 OMG norm

### Repository structure ###

This repository is organized around logical software components:

* `core`: The core software components for SysML 1.6 (profile, element type).
* `diagram`: Elements related to SysML diagrams (BDD, IBD, Parametric, Requirement)
* `releng`: Elements related to the creation of the rcp, update-site
* `table`: Elements related to SysML tables (Allocation, Requirement)
* `ui`: Elements related to other eclipse ui integration.

### How to build ###

Components in this project are built using Maven and its Tycho plugin for the build of Eclipse artifacts.
To build locally, simply execute the command line:

```
mvn clean install
```

To also build the modules relative to RCP and Product, please activate the following profile:

```
mvn clean install -Pproduct
```

If you are building inside a specific Eclipse version (plugins), you will need to specify:

```
mvn clean install -Pproduct -Dtycho.localArtifacts=ignore
```

To generate the site (documentation, javadoc, pdf), please activate the profile documentation and the one specific for pdf generation.
Several images are exported directly from Rcptt tests, so if you want to integrate them in the web site or pdf, please run first the "mvn clean install -Pproduct"

```
mvn site -Pdocumentation,documentation-pdf
```

In a near feature, we will deploy to a distant web site through:

```
mvn site site:stage-deploy scm-publish:publish-scm -Pdocumentation,documentation-pdf

It is possible that you encounter some difficulties if you are working with several version of Papyrus in your Maven and Eclipse workspace.
So you can force tycho to download the right version by using:

```
mvn clean install -Dtycho.localArtifacts=ignore 

### Building against a specific Eclipse Release ###

By default SysML16 is build against latest stable Eclipse Release Train (2020-12).

### Building for Eclipser server ###

If you want to pack and sign the project, you have to use the following profiles:

```
-Peclipse-pack
```

and

```
-Peclipse-sign
```

### How to extract basic requirements from normative pdf ###

Have a look to src/site/xdoc/developer/normRequirementExtraction.xml

## Hudson CI 
Build Status : ![Nightly Build Status](https://ci.eclipse.org/papyrus/view/Sysml/job/papyrus-sysml16-master/lastBuild/buildStatus)

### How to change version ###

```
mvn -Dtycho.mode=maven org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=*new-version*-SNAPSHOT
```
Manual operation : change all Require-Bundle from bundle-version="*old-version*" to bundle-version="*new-version*"

Verify that the *new version* is present in : 
 - All Manifest.MF 
 - the root pom.xml