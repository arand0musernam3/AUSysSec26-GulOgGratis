package ja0;

import ia0.d0;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24833a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f24834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f24835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f24836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f24837e;

    public /* synthetic */ m(d0 d0Var, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.f24835c = d0Var;
        this.f24834b = objectRef;
        this.f24836d = objectRef2;
        this.f24837e = objectRef3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v11, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v13, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v15, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v24, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v26, types: [T, java.lang.Long] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i11 = this.f24833a;
        int iIntValue = ((Integer) obj).intValue();
        Long l = (Long) obj2;
        switch (i11) {
            case 0:
                long jLongValue = l.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        i4.a.k("bad zip: extended timestamp extra too short");
                    } else {
                        d0 d0Var = this.f24835c;
                        byte b8 = d0Var.readByte();
                        boolean z11 = (b8 & 1) == 1;
                        boolean z12 = (b8 & 2) == 2;
                        boolean z13 = (b8 & 4) == 4;
                        long j9 = z11 ? 5L : 1L;
                        if (z12) {
                            j9 += 4;
                        }
                        if (z13) {
                            j9 += 4;
                        }
                        if (jLongValue < j9) {
                            i4.a.k("bad zip: extended timestamp extra too short");
                        } else {
                            if (z11) {
                                this.f24834b.element = Integer.valueOf(d0Var.r());
                            }
                            if (z12) {
                                this.f24836d.element = Integer.valueOf(d0Var.r());
                            }
                            if (z13) {
                                this.f24837e.element = Integer.valueOf(d0Var.r());
                            }
                        }
                    }
                }
                break;
            default:
                long jLongValue2 = l.longValue();
                if (iIntValue == 1) {
                    Ref.ObjectRef objectRef = this.f24834b;
                    if (objectRef.element != 0) {
                        i4.a.k("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else if (jLongValue2 != 24) {
                        i4.a.k("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    } else {
                        d0 d0Var2 = this.f24835c;
                        objectRef.element = Long.valueOf(d0Var2.t());
                        this.f24836d.element = Long.valueOf(d0Var2.t());
                        this.f24837e.element = Long.valueOf(d0Var2.t());
                    }
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ m(Ref.ObjectRef objectRef, d0 d0Var, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.f24834b = objectRef;
        this.f24835c = d0Var;
        this.f24836d = objectRef2;
        this.f24837e = objectRef3;
    }
}
