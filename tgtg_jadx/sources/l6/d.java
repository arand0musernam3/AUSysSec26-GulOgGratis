package l6;

import f6.t;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends k6.g {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f27393n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final HashMap f27394o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final HashMap f27395p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final HashMap f27396q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public HashMap f27397r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public HashMap f27398s0;
    public k6.i t0;

    public d(t tVar, k6.l lVar) {
        super(tVar, lVar);
        this.f27393n0 = 0.5f;
        this.f27394o0 = new HashMap();
        this.f27395p0 = new HashMap();
        this.f27396q0 = new HashMap();
        this.t0 = k6.i.SPREAD;
    }

    public final float t(String str) {
        HashMap map = this.f27398s0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f27398s0.get(str)).floatValue();
    }

    public final float u(String str) {
        HashMap map = this.f27396q0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    public final float v(String str) {
        HashMap map = this.f27397r0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f27397r0.get(str)).floatValue();
    }

    public final float w(String str) {
        HashMap map = this.f27395p0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }
}
