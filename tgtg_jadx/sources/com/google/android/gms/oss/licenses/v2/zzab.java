package com.google.android.gms.oss.licenses.v2;

import bb.a;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import n9.e;
import o9.d;
import o9.j;
import o9.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzab implements j {
    public static final /* synthetic */ int zza = 0;

    @NotNull
    private final a zzb;

    public zzab(@NotNull a aVar) {
        aVar.getClass();
        this.zzb = aVar;
    }

    @Override // o9.j
    @Nullable
    public final d calculateScene(@NotNull k kVar, @NotNull List list) {
        e eVar;
        Object objPrevious;
        kVar.getClass();
        list.getClass();
        if (this.zzb.f6101a < 600 || (eVar = (e) CollectionsKt.X(list)) == null) {
            return null;
        }
        if (true != eVar.f30743c.containsKey("ListDetailScene-Detail")) {
            eVar = null;
        }
        if (eVar == null) {
            return null;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((e) objPrevious).f30743c.containsKey("ListDetailScene-List")) {
                break;
            }
        }
        e eVar2 = (e) objPrevious;
        if (eVar2 != null) {
            return new zzz(eVar2.f30742b, CollectionsKt.K(list), eVar2, eVar);
        }
        return null;
    }

    @NotNull
    public j then(@NotNull j jVar) {
        return new a50.d(24, this, jVar);
    }
}
