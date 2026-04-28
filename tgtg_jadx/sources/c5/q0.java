package c5;

import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends Lambda implements Function0 {
    public static final q0 A;
    public static final q0 B;
    public static final q0 C;
    public static final q0 D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f7322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f7323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q0 f7324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q0 f7325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q0 f7326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q0 f7327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q0 f7328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q0 f7329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q0 f7330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q0 f7331k;
    public static final q0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q0 f7332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q0 f7333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q0 f7334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q0 f7335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q0 f7336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q0 f7337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q0 f7338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q0 f7339t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q0 f7340u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q0 f7341v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q0 f7342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final q0 f7343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q0 f7344y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final q0 f7345z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7346a;

    static {
        int i11 = 0;
        f7322b = new q0(i11, 0);
        f7323c = new q0(i11, 1);
        f7324d = new q0(i11, 2);
        f7325e = new q0(i11, 3);
        f7326f = new q0(i11, 4);
        f7327g = new q0(i11, 5);
        f7328h = new q0(i11, 6);
        f7329i = new q0(i11, 7);
        f7330j = new q0(i11, 8);
        f7331k = new q0(i11, 9);
        l = new q0(i11, 10);
        f7332m = new q0(i11, 11);
        f7333n = new q0(i11, 12);
        f7334o = new q0(i11, 13);
        f7335p = new q0(i11, 14);
        f7336q = new q0(i11, 15);
        f7337r = new q0(i11, 16);
        f7338s = new q0(i11, 17);
        f7339t = new q0(i11, 18);
        f7340u = new q0(i11, 19);
        f7341v = new q0(i11, 20);
        f7342w = new q0(i11, 21);
        f7343x = new q0(i11, 22);
        f7344y = new q0(i11, 23);
        f7345z = new q0(i11, 24);
        A = new q0(i11, 25);
        B = new q0(i11, 26);
        C = new q0(i11, 27);
        D = new q0(i11, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i11, int i12) {
        super(i11);
        this.f7346a = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        x70.c cVar = null;
        switch (this.f7346a) {
            case 0:
                v0.b("LocalConfiguration");
                throw null;
            case 1:
                v0.b("LocalContext");
                throw null;
            case 2:
                v0.b("LocalImageVectorCache");
                throw null;
            case 3:
                v0.b("LocalResourceIdCache");
                throw null;
            case 4:
                v0.b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    c90.f fVar = v80.p0.f42144a;
                    choreographer = (Choreographer) v80.f0.E(a90.p.f1044a, new z0(2, cVar, 0));
                }
                c1 c1Var = new c1(choreographer, jf.e.p(Looper.getMainLooper()));
                return c1Var.plus(c1Var.f7147k);
            case 6:
            case 7:
                return null;
            case 8:
                x1.b("LocalAutofillManager");
                throw null;
            case 9:
                x1.b("LocalAutofillTree");
                throw null;
            case 10:
                x1.b("LocalClipboard");
                throw null;
            case 11:
                x1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                x1.b("LocalDensity");
                throw null;
            case 14:
                x1.b("LocalFocusManager");
                throw null;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                x1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                x1.b("LocalFontLoader");
                throw null;
            case 17:
                x1.b("LocalGraphicsContext");
                throw null;
            case 18:
                x1.b("LocalHapticFeedback");
                throw null;
            case 19:
                x1.b("LocalInputManager");
                throw null;
            case 20:
                x1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                x1.b("LocalTextToolbar");
                throw null;
            case 26:
                x1.b("LocalUriHandler");
                throw null;
            case 27:
                x1.b("LocalViewConfiguration");
                throw null;
            default:
                x1.b("LocalWindowInfo");
                throw null;
        }
    }
}
