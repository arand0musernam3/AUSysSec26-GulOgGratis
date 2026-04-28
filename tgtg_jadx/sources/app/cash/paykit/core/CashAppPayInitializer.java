package app.cash.paykit.core;

import android.content.Context;
import androidx.annotation.Keep;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import ma.b;
import org.jetbrains.annotations.NotNull;
import yb.c;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/cash/paykit/core/CashAppPayInitializer;", "Lma/b;", "Lyb/c;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Lyb/c;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CashAppPayInitializer implements b {
    @Override // ma.b
    @NotNull
    public c create(@NotNull Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        if (!z20.b.f46934b) {
            z20.b.f46934b = true;
            z20.b.f46935c = new WeakReference(applicationContext.getApplicationContext());
        }
        return new h();
    }

    @Override // ma.b
    @NotNull
    public List<Class<? extends b>> dependencies() {
        return n0.f26529a;
    }
}
