package tutorial.lesson47


import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import io.dropwizard.assets.AssetsBundle

class Lesson47Application extends Application<DropWizardConfig> {

    @Override
    void run(DropWizardConfig configuration, Environment environment) throws Exception {
        environment.jersey().register(new Lesson47Resource())
    }
}
