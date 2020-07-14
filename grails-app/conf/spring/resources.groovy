import org.springframework.cloud.consul.ConsulEndpoint
import org.springframework.cloud.consul.config.ConsulConfigProperties
import org.springframework.cloud.consul.config.ConsulPropertySourceLocator

// Place your Spring DSL code here
beans = {
  //I should not have to specify these beans because Spring should be auto-creating them
  //If you comment out these beans the app will fail to bootstrap

  consulEndpoint(ConsulEndpoint)
  consulConfigProperties(ConsulConfigProperties)
  consulPropertySourceLocator(ConsulPropertySourceLocator)
}
