package subreddit.android.appstore.screens.list;

import dagger.Component;
import subreddit.android.appstore.AppComponent;
import subreddit.android.appstore.util.dagger.ActivityScope;


@ActivityScope
@Component(modules = AppListModule.class, dependencies = AppComponent.class)
public interface AppListComponent {
    void inject(AppListFragment fragment);
}
