package tutorial.lesson47


import io.dropwizard.Application
import io.dropwizard.Configuration
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import io.dropwizard.assets.AssetsBundle

class Lesson47Application extends Application<Configuration> {

    @Override
    void run(Configuration configuration, Environment environment) throws Exception {
        environment.jersey().register(new Lesson47Resource())
    }
}
