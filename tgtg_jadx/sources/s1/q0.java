package s1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f38665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Function1 function1, int i11) {
        super(1);
        this.f38664a = i11;
        this.f38665b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38664a) {
            case 0:
                long j9 = ((z5.l) obj).f47286a;
                return new z5.l((((long) ((Number) this.f38665b.invoke(Integer.valueOf((int) (j9 >> 32)))).intValue()) << 32) | (4294967295L & ((long) ((int) (j9 & 4294967295L)))));
            case 1:
                long j11 = ((z5.l) obj).f47286a;
                return new z5.l((((long) ((int) (j11 >> 32))) << 32) | (4294967295L & ((long) ((Number) this.f38665b.invoke(Integer.valueOf((int) (j11 & 4294967295L)))).intValue())));
            case 2:
                long j12 = ((z5.l) obj).f47286a;
                return new z5.l((((long) ((Number) this.f38665b.invoke(Integer.valueOf((int) (j12 >> 32)))).intValue()) << 32) | (4294967295L & ((long) ((int) (j12 & 4294967295L)))));
            case 3:
                long j13 = ((z5.l) obj).f47286a;
                return new z5.l((((long) ((int) (j13 >> 32))) << 32) | (4294967295L & ((long) ((Number) this.f38665b.invoke(Integer.valueOf((int) (j13 & 4294967295L)))).intValue())));
            case 4:
                return new z5.j((((long) ((Number) this.f38665b.invoke(Integer.valueOf((int) (((z5.l) obj).f47286a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 5:
                return new z5.j((((long) 0) << 32) | (4294967295L & ((long) ((Number) this.f38665b.invoke(Integer.valueOf((int) (((z5.l) obj).f47286a & 4294967295L)))).intValue())));
            case 6:
                return new z5.j((((long) ((Number) this.f38665b.invoke(Integer.valueOf((int) (((z5.l) obj).f47286a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            default:
                return new z5.j((((long) 0) << 32) | (4294967295L & ((long) ((Number) this.f38665b.invoke(Integer.valueOf((int) (((z5.l) obj).f47286a & 4294967295L)))).intValue())));
        }
    }
}
