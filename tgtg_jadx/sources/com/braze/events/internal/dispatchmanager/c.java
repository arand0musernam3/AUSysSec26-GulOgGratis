package com.braze.events.internal.dispatchmanager;

import com.braze.models.q;
import com.braze.requests.o;
import e0.f;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9793e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f9796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f9797d;

    public c(b bVar, List list, q qVar, com.braze.requests.b bVar2, int i11) {
        list = (i11 & 2) != 0 ? n0.f26529a : list;
        qVar = (i11 & 4) != 0 ? null : qVar;
        bVar2 = (i11 & 8) != 0 ? null : bVar2;
        bVar.getClass();
        list.getClass();
        this.f9794a = bVar;
        this.f9795b = list;
        this.f9796c = qVar;
        this.f9797d = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9794a == cVar.f9794a && Intrinsics.areEqual(this.f9795b, cVar.f9795b) && Intrinsics.areEqual(this.f9796c, cVar.f9796c) && Intrinsics.areEqual(this.f9797d, cVar.f9797d);
    }

    public final int hashCode() {
        int iC = f.c(this.f9795b, this.f9794a.hashCode() * 31, 31);
        q qVar = this.f9796c;
        int iHashCode = (iC + (qVar == null ? 0 : qVar.f10215a.hashCode())) * 31;
        o oVar = this.f9797d;
        return iHashCode + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "DispatchCommandEvent(commandType=" + this.f9794a + ", brazeEvents=" + this.f9795b + ", sessionId=" + this.f9796c + ", brazeRequest=" + this.f9797d + ")";
    }
}
