package co.datadome.sdk;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f8712a = new AtomicBoolean(false);

    public static void a(String str) {
        if (f8712a.get()) {
            Log.d("DataDome", str);
        }
    }
}
