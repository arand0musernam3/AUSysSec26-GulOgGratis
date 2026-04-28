package qa;

import android.view.animation.AnimationUtils;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36738c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k8.i f36740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a3.j f36741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f36742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0 f36743h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36736a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36739d = 0;

    public v(e0 e0Var) {
        this.f36743h = e0Var;
        a3.j jVar = new a3.j(8, (char) 0);
        long[] jArr = new long[20];
        jVar.f399c = jArr;
        jVar.f400d = new float[20];
        jVar.f398b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f36741f = jVar;
    }

    @Override // qa.z, qa.w
    public final void g(y yVar) {
        this.f36738c = true;
    }

    public final void h() {
        if (this.f36737b) {
            i();
            this.f36740e.a(this.f36743h.f36773z + 1);
        } else {
            this.f36739d = 1;
            this.f36742g = null;
        }
    }

    public final void i() {
        char c3;
        float f11;
        if (this.f36740e != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f12 = this.f36736a;
        a3.j jVar = this.f36741f;
        int i11 = jVar.f398b;
        float[] fArr = (float[]) jVar.f400d;
        long[] jArr = (long[]) jVar.f399c;
        char c7 = 20;
        int i12 = (i11 + 1) % 20;
        jVar.f398b = i12;
        jArr[i12] = jCurrentAnimationTimeMillis;
        fArr[i12] = f12;
        d2.e eVar = new d2.e(4, false);
        float fSqrt = 0.0f;
        eVar.f13775b = 0.0f;
        this.f36740e = new k8.i(eVar);
        k8.j jVar2 = new k8.j();
        jVar2.a(1.0f);
        jVar2.b(200.0f);
        k8.i iVar = this.f36740e;
        iVar.f26164m = jVar2;
        iVar.f26154b = this.f36736a;
        iVar.f26155c = true;
        ArrayList arrayList = iVar.l;
        if (iVar.f26158f) {
            h2.a("Error: Update listeners must be added beforethe animation.");
            return;
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        k8.i iVar2 = this.f36740e;
        int i13 = jVar.f398b;
        long j9 = Long.MIN_VALUE;
        if (i13 != 0 || jArr[i13] != Long.MIN_VALUE) {
            long j11 = jArr[i13];
            int i14 = 0;
            long j12 = j11;
            while (true) {
                long j13 = jArr[i13];
                if (j13 == j9) {
                    break;
                }
                float f13 = j11 - j13;
                float fAbs = Math.abs(j13 - j12);
                if (f13 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i13 == 0) {
                    i13 = 20;
                }
                i13--;
                i14++;
                if (i14 >= 20) {
                    break;
                }
                j12 = j13;
                j9 = Long.MIN_VALUE;
            }
            if (i14 >= 2) {
                int i15 = jVar.f398b;
                float f14 = 1000.0f;
                if (i14 == 2) {
                    int i16 = i15 == 0 ? 19 : i15 - 1;
                    float f15 = jArr[i15] - jArr[i16];
                    if (f15 != 0.0f) {
                        fSqrt = ((fArr[i15] - fArr[i16]) / f15) * 1000.0f;
                    }
                } else {
                    int i17 = ((i15 - i14) + 21) % 20;
                    int i18 = (i15 + 21) % 20;
                    long j14 = jArr[i17];
                    float f16 = fArr[i17];
                    int i19 = i17 + 1;
                    int i21 = i19 % 20;
                    float f17 = 0.0f;
                    while (i21 != i18) {
                        long j15 = jArr[i21];
                        float f18 = fSqrt;
                        int i22 = i18;
                        float f19 = j15 - j14;
                        if (f19 == f18) {
                            c3 = c7;
                            f11 = f14;
                        } else {
                            float f20 = fArr[i21];
                            c3 = c7;
                            f11 = f14;
                            float f21 = (f20 - f16) / f19;
                            float fAbs2 = (Math.abs(f21) * (f21 - ((float) (Math.sqrt(2.0f * Math.abs(f17)) * ((double) Math.signum(f17)))))) + f17;
                            if (i21 == i19) {
                                fAbs2 *= 0.5f;
                            }
                            f17 = fAbs2;
                            f16 = f20;
                            j14 = j15;
                        }
                        i21 = (i21 + 1) % 20;
                        fSqrt = f18;
                        i18 = i22;
                        c7 = c3;
                        f14 = f11;
                    }
                    fSqrt = ((float) (Math.sqrt(Math.abs(f17) * 2.0f) * ((double) Math.signum(f17)))) * f14;
                }
            }
        }
        iVar2.f26153a = fSqrt;
        k8.i iVar3 = this.f36740e;
        iVar3.f26159g = this.f36743h.f36773z + 1;
        iVar3.f26160h = -1.0f;
        iVar3.f26162j = 4.0f;
        u uVar = new u(this);
        ArrayList arrayList2 = iVar3.f26163k;
        if (arrayList2.contains(uVar)) {
            return;
        }
        arrayList2.add(uVar);
    }
}
