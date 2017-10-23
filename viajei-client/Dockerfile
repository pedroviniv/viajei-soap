FROM payara/server-full
MAINTAINER Pedro Arthur <pfernandesvasconcelos@gmail.com>
#domain1 which the project will be deployed
ENV DOMAIN domain1
#Enviroment variable pointing to the Domain lib folder.
ENV LIB /opt/payara41/glassfish/domains/${DOMAIN}/lib/
#Enviroment variable pointing to the deployment folder
ENV DEPLOY ${PAYARA_PATH}/glassfish/domains/${DOMAIN}/autodeploy/
#adding the project libs to the lib folder
ADD target/viajei-client/WEB-INF/lib/ ${LIB}
#Defining the entrypoint of this Dockerfile. 
#The command will start the domain1 with the flag --verbose
ENTRYPOINT $PAYARA_PATH/bin/asadmin start-domain --verbose ${DOMAIN}
#Adding the war into the deploy folder
ADD target/viajei-client.war ${DEPLOY}


