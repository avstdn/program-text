#!/bin/bash

PATH_TO_PROJECT=/home/astudenikin/IdeaProjects/soop

echo '==================='
echo '= EXECUTION BEGIN ='
echo '==================='

java -jar program-text.jar ${PATH_TO_PROJECT}/soop-test/src .java 0 soop-test

echo '=================='
echo '= EXECUTION DONE ='
echo '=================='