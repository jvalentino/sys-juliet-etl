#!/bin/sh
HELM_NAME=sys-etl

kubectl port-forward --namespace default svc/$HELM_NAME 8084:8080 > build/$HELM_NAME.log 2>&1 &
curl http://localhost:8084/actuator/health

while [ $? -ne 0 ]; do
    kubectl port-forward --namespace default svc/$HELM_NAME 8084:8080 > build/$HELM_NAME.log 2>&1 &
    curl http://localhost:8084/actuator/health
    sleep 5
done
