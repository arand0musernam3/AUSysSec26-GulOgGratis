package a3;

import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.b1 f508b;

    public /* synthetic */ p0(m3.b1 b1Var, int i11) {
        this.f507a = i11;
        this.f508b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f507a) {
            case 0:
                this.f508b.setValue((i0) obj);
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    this.f508b.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                co.q qVar = (co.q) obj;
                qVar.getClass();
                this.f508b.setValue(qVar);
                break;
            case 3:
                v80.i1 i1Var = (v80.i1) obj;
                i1Var.getClass();
                this.f508b.setValue(i1Var);
                break;
            case 4:
                z4.z zVar = (z4.z) obj;
                zVar.getClass();
                this.f508b.setValue(zVar);
                break;
            case 5:
                String str = (String) obj;
                str.getClass();
                this.f508b.setValue(str);
                break;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                this.f508b.setValue(str2);
                break;
            case 7:
                ((Boolean) obj).getClass();
                this.f508b.setValue(Boolean.valueOf(!((Boolean) r6.getValue()).booleanValue()));
                break;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f508b.setValue(bool);
                break;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f508b.setValue(bool2);
                break;
            case 10:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.f508b.setValue(bool3);
                break;
            case 11:
                this.f508b.setValue((z4.z) obj);
                break;
            case 12:
                this.f508b.setValue(new h4.b(((z4.z) obj).z(0L)));
                break;
            case 13:
                z4.z zVar2 = (z4.z) obj;
                zVar2.getClass();
                z4.z zVarK = zVar2.K();
                this.f508b.setValue(Float.valueOf(Float.intBitsToFloat((int) ((zVarK != null ? zVarK.g(zVar2, 0L) : 0L) & 4294967295L))));
                break;
            case 14:
                ChipVariant chipVariant = (ChipVariant) obj;
                chipVariant.getClass();
                this.f508b.setValue(chipVariant);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                this.f508b.setValue(bool4);
                break;
            case 16:
                ChipVariant chipVariant2 = (ChipVariant) obj;
                chipVariant2.getClass();
                this.f508b.setValue(chipVariant2);
                break;
            case 17:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                this.f508b.setValue(bool5);
                break;
            case 18:
                Boolean bool6 = (Boolean) obj;
                bool6.getClass();
                this.f508b.setValue(bool6);
                break;
            case 19:
                Boolean bool7 = (Boolean) obj;
                bool7.getClass();
                this.f508b.setValue(bool7);
                break;
            case 20:
                Boolean bool8 = (Boolean) obj;
                bool8.getClass();
                this.f508b.setValue(bool8);
                break;
            case 21:
                Boolean bool9 = (Boolean) obj;
                bool9.getClass();
                this.f508b.setValue(bool9);
                break;
            case 22:
                Boolean bool10 = (Boolean) obj;
                bool10.getClass();
                this.f508b.setValue(bool10);
                break;
            case 23:
                Boolean bool11 = (Boolean) obj;
                bool11.getClass();
                this.f508b.setValue(bool11);
                break;
            case 24:
                Boolean bool12 = (Boolean) obj;
                bool12.getClass();
                this.f508b.setValue(bool12);
                break;
            case 25:
                Boolean bool13 = (Boolean) obj;
                bool13.booleanValue();
                this.f508b.setValue(bool13);
                break;
            case 26:
                Boolean bool14 = (Boolean) obj;
                bool14.booleanValue();
                this.f508b.setValue(bool14);
                break;
            case 27:
                g4.z zVar3 = (g4.z) obj;
                zVar3.getClass();
                this.f508b.setValue(Boolean.valueOf(((g4.b0) zVar3).a()));
                break;
            case 28:
                Boolean bool15 = (Boolean) obj;
                bool15.getClass();
                this.f508b.setValue(bool15);
                break;
            default:
                Boolean bool16 = (Boolean) obj;
                bool16.getClass();
                this.f508b.setValue(bool16);
                break;
        }
        return Unit.f26487a;
    }
}
