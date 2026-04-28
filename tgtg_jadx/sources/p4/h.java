package p4;

import android.graphics.Path;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i4.r f34330b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f34334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i4.r f34335g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f34339k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f34340m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f34343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k4.h f34344q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i4.h f34345r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i4.h f34346s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i4.h f34347t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f34348u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f34331c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f34332d = h0.f34349a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f34333e = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34336h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34337i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f34338j = 4.0f;
    public float l = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f34341n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f34342o = true;

    public h() {
        i4.h hVarA = i4.l.a();
        this.f34345r = hVarA;
        this.f34346s = hVarA;
        this.f34348u = u70.l.a(u70.m.NONE, g.f34317b);
    }

    @Override // p4.d0
    public final void a(k4.d dVar) {
        k4.h hVar;
        if (this.f34341n) {
            c0.b(this.f34332d, this.f34345r);
            e();
        } else if (this.f34343p) {
            e();
        }
        this.f34341n = false;
        this.f34343p = false;
        i4.r rVar = this.f34330b;
        if (rVar != null) {
            k4.d.s(dVar, this.f34346s, rVar, this.f34331c, null, 56);
        }
        i4.r rVar2 = this.f34335g;
        if (rVar2 != null) {
            k4.h hVar2 = this.f34344q;
            if (this.f34342o || hVar2 == null) {
                k4.h hVar3 = new k4.h(this.f34334f, this.f34338j, this.f34336h, this.f34337i, null, 16);
                this.f34344q = hVar3;
                this.f34342o = false;
                hVar = hVar3;
            } else {
                hVar = hVar2;
            }
            k4.d.s(dVar, this.f34346s, rVar2, this.f34333e, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, u70.j] */
    public final void e() {
        float f11 = this.f34339k;
        i4.h hVar = this.f34345r;
        if (f11 == 0.0f && this.l == 1.0f) {
            this.f34346s = hVar;
            return;
        }
        if (Intrinsics.areEqual(this.f34346s, hVar)) {
            this.f34346s = i4.l.a();
        } else {
            int i11 = this.f34346s.f23258a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f34346s.f23258a.rewind();
            this.f34346s.i(i11);
        }
        ?? r02 = this.f34348u;
        ((i4.j) r02.getValue()).f23265a.setPath(hVar != null ? hVar.f23258a : null, false);
        float length = ((i4.j) r02.getValue()).f23265a.getLength();
        float f12 = this.f34339k;
        float f13 = this.f34340m;
        float f14 = ((f12 + f13) % 1.0f) * length;
        float f15 = ((this.l + f13) % 1.0f) * length;
        if (f14 <= f15) {
            ((i4.j) r02.getValue()).a(f14, f15, this.f34346s);
            return;
        }
        i4.h hVarA = this.f34347t;
        if (hVarA == null) {
            hVarA = i4.l.a();
            this.f34347t = hVarA;
        }
        hVarA.h();
        ((i4.j) r02.getValue()).a(f14, length, hVarA);
        i4.h.a(this.f34346s, hVarA);
        hVarA.h();
        ((i4.j) r02.getValue()).a(0.0f, f15, hVarA);
        i4.h.a(this.f34346s, hVarA);
    }

    public final String toString() {
        return this.f34345r.toString();
    }
}
