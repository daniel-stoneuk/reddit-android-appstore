package subreddit.android.appstore.screens.details;

import dagger.Component;
import subreddit.android.appstore.AppComponent;
import subreddit.android.appstore.util.dagger.ActivityScope;


@ActivityScope
@Component(modules = AppDetailsModule.class, dependencies = AppComponent.class)
public interface AppDetailsComponent {
    void inject(AppDetailsFragment fragment);
}
