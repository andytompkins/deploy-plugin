deploy-plugin
=============

Jenkins deploy plugin
---------------------

This is a fork of the deploy-plugin with additional support for Jetty 7, 8, and 9 remote, via the cargo-jetty-deployer.
You will have to deploy the cargo-jetty-deployer.war file to any running instance of Jetty that you want to deploy/undeploy to.
The cargo-jetty-deployer has some limitations. It will not undeploy wars that are deployed with a context file, or wars that are outside of webapps (like hot-deploy).
