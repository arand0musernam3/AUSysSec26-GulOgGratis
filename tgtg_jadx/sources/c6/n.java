package c6;

import androidx.lifecycle.LifecycleOwner;
import b5.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Lambda implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f7731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f7732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f7733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f7734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f7735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f7736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f7737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f7738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f7739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f7740k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7741a;

    static {
        int i11 = 2;
        f7731b = new n(i11, 0);
        f7732c = new n(i11, 1);
        f7733d = new n(i11, 2);
        f7734e = new n(i11, 3);
        f7735f = new n(i11, 4);
        f7736g = new n(i11, 5);
        f7737h = new n(i11, 6);
        f7738i = new n(i11, 7);
        f7739j = new n(i11, 8);
        f7740k = new n(i11, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i11, int i12) {
        super(i11);
        this.f7741a = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7741a) {
            case 0:
                r.c((m0) obj).setResetBlock((Function1) obj2);
                break;
            case 1:
                r.c((m0) obj).setUpdateBlock((Function1) obj2);
                break;
            case 2:
                r.c((m0) obj).setReleaseBlock((Function1) obj2);
                break;
            case 3:
                r.c((m0) obj).setUpdateBlock((Function1) obj2);
                break;
            case 4:
                r.c((m0) obj).setReleaseBlock((Function1) obj2);
                break;
            case 5:
                r.c((m0) obj).setModifier((b4.t) obj2);
                break;
            case 6:
                r.c((m0) obj).setDensity((z5.c) obj2);
                break;
            case 7:
                r.c((m0) obj).setLifecycleOwner((LifecycleOwner) obj2);
                break;
            case 8:
                r.c((m0) obj).setSavedStateRegistryOwner((ea.f) obj2);
                break;
            default:
                d0 d0VarC = r.c((m0) obj);
                int i11 = q.$EnumSwitchMapping$0[((z5.m) obj2).ordinal()];
                int i12 = 1;
                if (i11 == 1) {
                    i12 = 0;
                } else if (i11 != 2) {
                    e40.a.f();
                }
                d0VarC.setLayoutDirection(i12);
                break;
        }
        return Unit.f26487a;
    }
}
