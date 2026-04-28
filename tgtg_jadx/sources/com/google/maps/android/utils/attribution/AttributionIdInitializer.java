package com.google.maps.android.utils.attribution;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import ma.b;
import n00.d;
import org.jetbrains.annotations.NotNull;
import t00.h;
import u00.e;
import u00.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/maps/android/utils/attribution/AttributionIdInitializer;", "Lma/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "library_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AttributionIdInitializer implements b {
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public void m547create(@NotNull Context context) {
        context.getClass();
        try {
            h hVar = new h(context);
            if (e.f40622b == null) {
                e.f40623c.add(hVar);
                return;
            }
            f fVar = e.f40622b;
            yz.b bVar = new yz.b(context);
            Parcel parcelL = fVar.L();
            d.d(parcelL, bVar);
            parcelL.writeString("gmp_git_androidmapsutils_v4.1.1");
            fVar.M(12, parcelL);
        } catch (RemoteException e5) {
            Log.e("k", "Failed to add internal usage attribution id.", e5);
        }
    }

    @Override // ma.b
    @NotNull
    public List<Class<? extends b>> dependencies() {
        return n0.f26529a;
    }

    @Override // ma.b
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m547create(context);
        return Unit.f26487a;
    }
}
