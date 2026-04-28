package c5;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7217a;

    public f1(Context context) {
        this.f7217a = context;
    }

    public final void a(String str) {
        try {
            this.f7217a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e5) {
            throw new IllegalArgumentException(e0.f.g('.', "Can't open ", str), e5);
        }
    }
}
