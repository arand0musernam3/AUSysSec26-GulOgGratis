package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends v2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f11764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final lh f11765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f11766h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Level f11768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f11769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lh f11770e;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(mg.f11639a, bh.f11295a, ch.f11330a)));
        f11764f = setUnmodifiableSet;
        lh lhVar = new lh(gg.b(setUnmodifiableSet));
        f11765g = lhVar;
        f11766h = new o(Level.ALL, setUnmodifiableSet, lhVar);
    }

    public /* synthetic */ q(String str, Level level, Set set, lh lhVar) {
        super(str);
        this.f11767b = h.b(str);
        this.f11768c = level;
        this.f11769d = set;
        this.f11770e = lhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(com.google.android.gms.internal.measurement.jg r28, java.lang.String r29, java.util.logging.Level r30, java.util.Set r31, com.google.android.gms.internal.measurement.lh r32) {
        /*
            Method dump skipped, instruction units count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q.m(com.google.android.gms.internal.measurement.jg, java.lang.String, java.util.logging.Level, java.util.Set, com.google.android.gms.internal.measurement.lh):void");
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final boolean e(Level level) {
        int iC = h.c(level);
        return Log.isLoggable(this.f11767b, iC) || Log.isLoggable("all", iC);
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final void f(jg jgVar) {
        m(jgVar, this.f11767b, this.f11768c, this.f11769d, this.f11770e);
    }
}
