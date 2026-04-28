package co.datadome.sdk;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public final class k extends FragmentManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataDomeWebView f8670a;

    public k(DataDomeWebView dataDomeWebView) {
        this.f8670a = dataDomeWebView;
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void a(FragmentManager fragmentManager, Fragment fragment) {
        fragment.getClass();
        DataDomeWebView dataDomeWebView = this.f8670a;
        String str = dataDomeWebView.f8637d;
        str.getClass();
        dataDomeWebView.e(str);
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void b(FragmentManager fragmentManager, Fragment fragment) {
        fragment.getClass();
        DataDomeWebView dataDomeWebView = this.f8670a;
        String str = dataDomeWebView.f8637d;
        str.getClass();
        dataDomeWebView.e(str);
    }
}
