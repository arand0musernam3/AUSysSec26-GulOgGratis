package wj;

import android.content.Context;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import mv.k;
import mv.l;
import mv.u;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt.d f43506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f43507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f43508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f43509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1 f43510f;

    public d(Context context, kt.d dVar, u uVar) {
        dVar.getClass();
        uVar.getClass();
        this.f43505a = context;
        this.f43506b = dVar;
        this.f43507c = uVar;
        this.f43508d = new HashSet();
        a2 a2VarC = r.c(n0.f26529a);
        this.f43509e = a2VarC;
        this.f43510f = new h1(a2VarC);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.util.List r6, z70.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof wj.a
            if (r0 == 0) goto L13
            r0 = r7
            wj.a r0 = (wj.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            wj.a r0 = new wj.a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f43499j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r7)
            u70.q r7 = (u70.q) r7
            java.lang.Object r5 = r7.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r7)
            vj.i r7 = new vj.i
            r7.<init>(r6)
            r0.l = r3
            kt.d r6 = r4.f43506b
            java.lang.Object r5 = r6.d(r5, r7, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.d.a(java.lang.String, java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, z70.c r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wj.b
            if (r0 == 0) goto L13
            r0 = r6
            wj.b r0 = (wj.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            wj.b r0 = new wj.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f43501j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            if (r7 == 0) goto L45
            u70.o r5 = u70.q.f40850b
            vj.c r5 = new vj.c
            vj.e r6 = vj.e.SCHEDULED
            a80.a r7 = vj.j.a()
            r5.<init>(r6, r7)
            return r5
        L45:
            r0.l = r3
            kt.d r6 = r4.f43506b
            java.lang.Object r5 = r6.g(r5, r0)
            if (r5 != r1) goto L50
            return r1
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.d.b(java.lang.String, z70.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r5, com.app.tgtg.model.remote.item.LatLngInfo r6, int r7, z70.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof wj.c
            if (r0 == 0) goto L13
            r0 = r8
            wj.c r0 = (wj.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            wj.c r0 = new wj.c
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f43503j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r5 = r8.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r8)
            com.app.tgtg.model.remote.favorites.request.FavoritesRequest r8 = new com.app.tgtg.model.remote.favorites.request.FavoritesRequest
            com.app.tgtg.model.remote.favorites.request.FavoritesPaging r2 = new com.app.tgtg.model.remote.favorites.request.FavoritesPaging
            r2.<init>(r5, r7)
            r8.<init>(r6, r2)
            java.time.ZonedDateTime r5 = java.time.ZonedDateTime.now()
            java.time.ZoneOffset r5 = r5.getOffset()
            java.lang.String r5 = r5.toString()
            r5.getClass()
            android.content.Context r6 = r4.f43505a
            boolean r6 = android.text.format.DateFormat.is24HourFormat(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.l = r3
            kt.d r7 = r4.f43506b
            java.lang.Object r5 = r7.b(r8, r5, r6, r0)
            if (r5 != r1) goto L63
            return r1
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.d.c(int, com.app.tgtg.model.remote.item.LatLngInfo, int, z70.c):java.lang.Object");
    }

    public final boolean d() {
        u uVar = this.f43507c;
        uVar.getClass();
        return Intrinsics.areEqual(uVar.a(k.APPTRK_CE_CUSTOM_FAVORITE_REMINDER), l.USING_OLD_PAGE.a());
    }

    public final boolean e(BasicItem basicItem) {
        if (basicItem == null || !basicItem.getFavorite()) {
            return false;
        }
        return d() || !mv.d.q(basicItem);
    }

    public final void f(String str, boolean z11) {
        str.getClass();
        HashSet hashSet = this.f43508d;
        ItemId itemIdM197boximpl = ItemId.m197boximpl(str);
        if (z11 ? hashSet.add(itemIdM197boximpl) : hashSet.remove(itemIdM197boximpl)) {
            this.f43509e.j(CollectionsKt.r0(hashSet));
        }
    }
}
