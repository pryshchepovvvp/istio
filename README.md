&nbsp;&nbsp;<h2>Lesson 1: Setting up environment </h2><br>
&nbsp;&nbsp;&nbsp;&nbsp;1. Setup local K8S instance DockerDesktop for MacOS <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1.1 brew install --cask docker <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1.2 Open docker desktop and enable Kubernetes
![Screenshot](Lesson1/k8s_in_dd.png)
&nbsp;&nbsp;2. Create DockerHub account if account doesn't exist yet
![Screenshot](Lesson1/DockerHub.png)
&nbsp;&nbsp;3. Create GitHub account if account doesn't exist yet
![Screenshot](Lesson1/GitHub.png)
&nbsp;&nbsp;4. Install K9S tool https://k9scli.io <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;brew install derailed/k9s/k9s <br>
![Screenshot](Lesson1/k9s.png)
&nbsp;&nbsp;5. Install K8S dashboard https://kubernetes.io/docs/tasks/access-application-cluster/web-ui-dashboard/ <br>
![Screenshot](Lesson1/K8S_dashboard.png)
&nbsp;&nbsp;6. Istall Istio https://istio.io/latest/docs/setup/getting-started/ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;6.1. Enable Kiali in helm temlate during installation https://istio.io/latest/docs/tasks/observability/kiali/ <br> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;6.2. Configure Jaeger tracing https://istio.io/latest/docs/tasks/observability/distributed-tracing/jaeger/ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Check successfull Istio installation
![Screenshot](Lesson1/Istio.png)
&nbsp;&nbsp;7. Learning <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Overwie the Istio https://istio.io/latest/about/service-mesh/ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Sidecar pattern https://docs.microsoft.com/en-us/azure/architecture/patterns/sidecar <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Ambassador pattern https://docs.microsoft.com/en-us/azure/architecture/patterns/ambassador 

&nbsp;&nbsp;<h2>Lesson 2: Application deployment and telemetry data </h2><br>
&nbsp;&nbsp;&nbsp;&nbsp;1,2. Install JDK11 &  Install a build tool maven <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1.1 brew install maven <br>
&nbsp;&nbsp;&nbsp;&nbsp;3. Build all services <br>
&nbsp;&nbsp;&nbsp;&nbsp;4. Publish application to your DockerHub repository <br>
![Screenshot](Lesson2/DockerHub.png)
&nbsp;&nbsp;&nbsp;&nbsp;5. Deploy application to  local Kubernetes <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5.1. Create namespace istio-course for deployment <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5.2. Make istio injection in this namespace <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; kubectl label namespace istio-course istio-injection=enabled
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5.3. Deploy all components <br>
![Screenshot](Lesson2/endpoints_check.png)
&nbsp;&nbsp;&nbsp;&nbsp;6. Execute query in browser <br>
![Screenshot](Lesson2/localhost_check.png)
&nbsp;&nbsp;&nbsp;&nbsp;7. Open Kiali - istioctl dashboard kiali <br>
![Screenshot](Lesson2/kiali_app.png)
![Screenshot](Lesson2/kiali_graph.png)
&nbsp;&nbsp;&nbsp;&nbsp;8. Open Jaeger - istioctl dashboard jaeger <br>
![Screenshot](Lesson2/jaeger.png)
&nbsp;&nbsp;&nbsp;&nbsp;9. Open Grafana - istioctl dashboard grafana <br>
![Screenshot](Lesson2/grafana_books.png)
![Screenshot](Lesson2/grafana_authors.png)
![Screenshot](Lesson2/grafana_frontend.png)
&nbsp;&nbsp;&nbsp;&nbsp;10. Learning <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Istio telemetry https://istio.io/latest/docs/tasks/observability/ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Istio monitoring https://istio.io/latest/docs/tasks/observability/metrics/using-istio-dashboard/ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Kiali tool https://kiali.io/docs/architecture/architecture/ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Open tracing https://opentracing.io/docs/overview/<br>
