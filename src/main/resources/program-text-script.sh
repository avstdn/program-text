#!/bin/bash

PATH_TO_PROJECT=/home/astudenikin/IdeaProjects/soop

echo '==================='
echo '= EXECUTION BEGIN ='
echo '==================='

java -jar program-text.jar ${PATH_TO_PROJECT}/soop-address/src .java 0 soop-address
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-actuator/src .java 0 soop-actuator
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-client/soop-ws .js,.scss ${PATH_TO_PROJECT}/soop-client/soop-ws/build,${PATH_TO_PROJECT}/soop-client/soop-ws/ext,${PATH_TO_PROJECT}/soop-client/soop-ws/packages,${PATH_TO_PROJECT}/soop-client/soop-ws/resources soop-client
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-common-type/src .java 0 soop-common-type
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-db/sql/ddl .sql 0 soop-db
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-eir-rmu/src .java 0 soop-eir-rmu
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-fanid/src .java 0 soop-fanid
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-fms/src .java 0 soop-fms
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-fssp/src .java 0 soop-fssp
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-gibdd/src .java 0 soop-gibdd
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-gis-gmp/src .java 0 soop-gis-gmp
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-ibdf/src .java 0 soop-ibdf
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-ibdm/src .java 0 soop-ibdm
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-nsi-addr/src .java 0 soop-nsi-addr
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-pautina/src .java 0 soop-pautina
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-query/src .java 0 soop-query
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-report/src .java 0 soop-report
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-rm/src .java 0 soop-rm
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-scuo/src .java 0 soop-scuo
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-search/src .java 0 soop-search
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-server/src .java 0 soop-server
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-signer-client/src .java 0 soop-signer-client
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-smev/src .java 0 soop-smev
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-smev-client/src .java 0 soop-smev-client
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-smev-common/src .java 0 soop-smev-common
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-smev-types/src .java 0 soop-smev-types
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-snils/src .java 0 soop-snils
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-snopos/src .java 0 soop-snopos
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-sokd/src .java 0 soop-sokd
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-soshp/src .java 0 soop-soshp
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-ws-consumer/src .java 0 soop-ws-consumer
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-ws-provider/src .java 0 soop-ws-provider
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-xjc-plugins/src .java 0 soop-xjc-plugins
java -jar program-text.jar ${PATH_TO_PROJECT}/soop-zags/src .java 0 soop-zags
java -jar program-text.jar ${PATH_TO_PROJECT}/sudis-sp/src .java 0 sudis-sp
java -jar program-text.jar ${PATH_TO_PROJECT}/sudis-token/src .java 0 sudis-token

echo '=================='
echo '= EXECUTION DONE ='
echo '=================='