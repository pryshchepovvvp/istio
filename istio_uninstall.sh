#!/bin/bash
#https://istio.io/latest/docs/setup/getting-started/
istioctl manifest generate --set profile=demo | kubectl delete --ignore-not-found=true -f -
kubectl delete namespace istio-system
kubectl label namespace default istio-injection-