package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import l8.j;
import l8.k;
import l8.m;
import l8.s;
import ma.a;
import ma.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // ma.b
    public final Object create(Context context) {
        Object objB;
        s sVar = new s(new m(context));
        sVar.f27452a = 1;
        if (j.f27456k == null) {
            synchronized (j.f27455j) {
                try {
                    if (j.f27456k == null) {
                        j.f27456k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f29899e) {
            try {
                objB = aVarC.f29900a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        Lifecycle lifecycle = ((LifecycleOwner) objB).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // ma.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
