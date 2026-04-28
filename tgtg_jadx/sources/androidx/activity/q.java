package androidx.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f1750a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, Context context) {
        super(context);
        this.f1750a = pVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        configuration.getClass();
        this.f1750a.run();
    }
}
