package g3;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f18891b;

    public /* synthetic */ j5(int i11, Function0 function0) {
        this.f18890a = i11;
        this.f18891b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18890a) {
            case 0:
                float fFloatValue = ((Number) this.f18891b.invoke()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                break;
            case 1:
                break;
            case 2:
                File file = (File) this.f18891b.invoke();
                if (!Intrinsics.areEqual(e80.m.f(file), "preferences_pb")) {
                    qc.y.j("File extension for file: ", file, " does not match required extension for Preferences file: preferences_pb");
                } else {
                    File absoluteFile = file.getAbsoluteFile();
                    absoluteFile.getClass();
                }
                break;
            case 3:
                this.f18891b.invoke();
                break;
            case 4:
                this.f18891b.invoke();
                break;
            case 5:
                this.f18891b.invoke();
                break;
            case 6:
                this.f18891b.invoke();
                break;
            case 7:
                Function0 function0 = this.f18891b;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 8:
                this.f18891b.invoke();
                break;
            case 9:
                this.f18891b.invoke();
                break;
            case 10:
                this.f18891b.invoke();
                break;
            case 11:
                this.f18891b.invoke();
                break;
            case 12:
                this.f18891b.invoke();
                break;
            case 13:
                this.f18891b.invoke();
                break;
            case 14:
                this.f18891b.invoke();
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f18891b.invoke();
                break;
            case 16:
                this.f18891b.invoke();
                break;
            case 17:
                this.f18891b.invoke();
                break;
            case 18:
                this.f18891b.invoke();
                break;
            case 19:
                this.f18891b.invoke();
                break;
            case 20:
                this.f18891b.invoke();
                break;
            case 21:
                this.f18891b.invoke();
                break;
            case 22:
                this.f18891b.invoke();
                break;
            case 23:
                this.f18891b.invoke();
                break;
            case 24:
                this.f18891b.invoke();
                break;
            case 25:
                this.f18891b.invoke();
                break;
            case 26:
                this.f18891b.invoke();
                break;
            case 27:
                this.f18891b.invoke();
                break;
            case 28:
                this.f18891b.invoke();
                break;
            default:
                this.f18891b.invoke();
                break;
        }
        return Unit.f26487a;
    }
}
