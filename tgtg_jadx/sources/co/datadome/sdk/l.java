package co.datadome.sdk;

import android.app.Fragment;
import android.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public final class l extends FragmentManager.FragmentLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataDomeWebView f8671a;

    public l(DataDomeWebView dataDomeWebView) {
        this.f8671a = dataDomeWebView;
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentPaused(fragmentManager, fragment);
        DataDomeWebView dataDomeWebView = this.f8671a;
        String str = dataDomeWebView.f8637d;
        str.getClass();
        dataDomeWebView.e(str);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        DataDomeWebView dataDomeWebView = this.f8671a;
        String str = dataDomeWebView.f8637d;
        str.getClass();
        dataDomeWebView.e(str);
    }
}
