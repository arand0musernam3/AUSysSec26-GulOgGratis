package oo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32736a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f32740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32742g;

    public /* synthetic */ a0(int i11, int i12, int i13, boolean z11, Function0 function0, int i14) {
        this.f32737b = i11;
        this.f32738c = i12;
        this.f32739d = i13;
        this.f32740e = z11;
        this.f32742g = function0;
        this.f32741f = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32736a) {
            case 0:
                ((Integer) obj2).getClass();
                a.O(this.f32737b, (String) this.f32742g, this.f32738c, this.f32740e, (m3.n) obj, m3.i.F(this.f32739d | 1), this.f32741f);
                break;
            default:
                ((Integer) obj2).intValue();
                yj.a.a(this.f32737b, this.f32738c, this.f32739d, this.f32740e, (Function0) this.f32742g, (m3.n) obj, m3.i.F(this.f32741f | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a0(String str, int i11, int i12, int i13, int i14, boolean z11) {
        this.f32737b = i11;
        this.f32742g = str;
        this.f32738c = i12;
        this.f32740e = z11;
        this.f32739d = i13;
        this.f32741f = i14;
    }
}
