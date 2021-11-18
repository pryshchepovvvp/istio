#!/bin/bash
#https://istio.io/latest/docs/setup/getting-started/
#curl -L https://istio.io/downloadIstio | sh -
istioctl install --set profile=demo -y
kubectl create namespace istio-course
kubectl label namespace istio-course istio-injection=enabled
kubectl get ns -L istio-injection
istioctl analyze
kubectl get svc istio-ingressgateway -n istio-system

#export INGRESS_PORT=$(kubectl -n istio-system get service istio-ingressgateway -o jsonpath='{.spec.ports[?(@.name=="http2")].nodePort}')
#export SECURE_INGRESS_PORT=$(kubectl -n istio-system get service istio-ingressgateway -o jsonpath='{.spec.ports[?(@.name=="https")].nodePort}')

#export INGRESS_HOST=127.0.0.1
#export GATEWAY_URL=$INGRESS_HOST:$INGRESS_PORT
#echo "$GATEWAY_URL"
#echo "http://$GATEWAY_URL/productpage"

kubectl apply -f https://raw.githubusercontent.com/istio/istio/release-1.11/samples/addons/kiali.yaml
kubectl apply -f https://raw.githubusercontent.com/istio/istio/release-1.11/samples/addons/jaeger.yaml
#kubectl apply -f https://raw.githubusercontent.com/istio/istio/release-1.11/samples/addons/grafana.yaml
kubectl apply -f https://raw.githubusercontent.com/istio/istio/release-1.11/samples/addons/prometheus.yaml

#istioctl dashboard kiali
#istioctl dashboard jeager
#istioctl dashboard grafana