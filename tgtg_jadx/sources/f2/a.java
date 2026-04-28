package f2;

import kotlin.collections.CollectionsKt;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f17056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f17057e;

    public static int a(g2.r rVar, boolean z11) {
        return z11 ? ((g2.s) ((g2.j) CollectionsKt.W(rVar.f18219m))).f18226a + 1 : ((g2.s) ((g2.j) CollectionsKt.O(rVar.f18219m))).f18226a - 1;
    }

    public static int b(s sVar, boolean z11) {
        return z11 ? ((t) ((m) CollectionsKt.W(sVar.f17192k))).f17199a + 1 : ((t) ((m) CollectionsKt.O(sVar.f17192k))).f17199a - 1;
    }

    public static int c(g2.r rVar, boolean z11) {
        if (z11) {
            g2.s sVar = (g2.s) ((g2.j) CollectionsKt.W(rVar.f18219m));
            return (rVar.f18223q == h2.Vertical ? sVar.f18245u : sVar.f18246v) + 1;
        }
        g2.s sVar2 = (g2.s) ((g2.j) CollectionsKt.O(rVar.f18219m));
        return (rVar.f18223q == h2.Vertical ? sVar2.f18245u : sVar2.f18246v) - 1;
    }
}
