package co.datadome.sdk;

import android.net.TrafficStats;
import q90.p0;

/* JADX INFO: loaded from: classes.dex */
public final class p implements q90.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8677a;

    @Override // q90.x
    public final p0 intercept(q90.w wVar) {
        int i11 = this.f8677a;
        if (i11 > 0) {
            TrafficStats.setThreadStatsTag(i11);
        }
        v90.g gVar = (v90.g) wVar;
        return gVar.b(gVar.f42190e);
    }
}
