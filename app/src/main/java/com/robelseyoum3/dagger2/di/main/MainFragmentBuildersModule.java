package com.robelseyoum3.dagger2.di.main;

import com.robelseyoum3.dagger2.ui.main.posts.PostsFragments;
import com.robelseyoum3.dagger2.ui.main.profile.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragments contributePostsFragment();
}
