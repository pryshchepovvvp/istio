&nbsp;&nbsp;<h2>Lesson 2: Application deployment and telemetry data </h2><br>
&nbsp;&nbsp;&nbsp;&nbsp;1,2. Install JDK11 &  Install a build tool maven <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1.1 brew install maven <br>
&nbsp;&nbsp;&nbsp;&nbsp;3. Build all services <br>
&nbsp;&nbsp;&nbsp;&nbsp;4. Publish application to your DockerHub repository <br>
![Screenshot](DockerHub.png)
&nbsp;&nbsp;&nbsp;&nbsp;5. Deploy application to  local Kubernetes <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5.1. Create namespace istio-course for deployment <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5.2. Make istio injection in this namespace <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; kubectl label namespace istio-course istio-injection=enabled
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5.3. Deploy all components <br>
![Screenshot](endpoints_check.png)
&nbsp;&nbsp;&nbsp;&nbsp;6. Execute query in browser <br>
![Screenshot](localhost_check.png)
&nbsp;&nbsp;&nbsp;&nbsp;7. Open Kiali - istioctl dashboard kiali <br>
![Screenshot](kiali_app.png)
![Screenshot](kiali_graph.png)
&nbsp;&nbsp;&nbsp;&nbsp;8. Open Jaeger - istioctl dashboard jaeger <br>
![Screenshot](jaeger.png)
&nbsp;&nbsp;&nbsp;&nbsp;9. Open Grafana - istioctl dashboard grafana <br>
![Screenshot](grafana_books.png)
![Screenshot](grafana_authors.png)
![Screenshot](grafana_frontend.png)
&nbsp;&nbsp;&nbsp;&nbsp;10. Learning <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Istio telemetry https://istio.io/latest/docs/tasks/observability/ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Istio monitoring https://istio.io/latest/docs/tasks/observability/metrics/using-istio-dashboard/ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Kiali tool https://kiali.io/docs/architecture/architecture/ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Open tracing https://opentracing.io/docs/overview/<br>
