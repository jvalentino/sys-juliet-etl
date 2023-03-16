#!/bin/sh
HELM_NAME=sys-etl

helm delete $HELM_NAME --wait
helm install $HELM_NAME --wait config/helm/$HELM_NAME --values config/helm/$HELM_NAME/values.yaml
sh -x ./verify.sh
