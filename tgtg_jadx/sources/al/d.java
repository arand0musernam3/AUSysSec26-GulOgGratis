package al;

import com.app.tgtg.feature.login.LoginActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1534a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj, int i11) {
        super(1, obj, LoginActivity.class, "handleLoginEvent", "handleLoginEvent(Lcom/app/tgtg/feature/login/data/LoginEvent;)V", 0);
        this.f1534a = i11;
        switch (i11) {
            case 6:
                super(1, obj, fn.c.class, "openUrl", "openUrl(Ljava/lang/String;)V", 0);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                super(1, obj, jj.c.class, "onSortSelected", "onSortSelected(Lcom/app/tgtg/model/remote/mapService/response/SortingOption;)V", 0);
                break;
            case 16:
                super(1, obj, jj.c.class, "onCollectionTimeStartChanged", "onCollectionTimeStartChanged(I)V", 0);
                break;
            case 17:
                super(1, obj, jj.c.class, "onCollectionTimeEndChanged", "onCollectionTimeEndChanged(I)V", 0);
                break;
            case 18:
                super(1, obj, jj.c.class, "onCollectionTimeDayToggled", "onCollectionTimeDayToggled(Lcom/app/tgtg/feature/complexquickfilters/domain/CollectionTimeDay;)V", 0);
                break;
            case 19:
                super(1, obj, jj.c.class, "onCategoryToggle", "onCategoryToggle(Lcom/app/tgtg/model/remote/mapService/response/FilterCategory;)V", 0);
                break;
            case 20:
                super(1, obj, jj.c.class, "onDietToggle", "onDietToggle(Lcom/app/tgtg/model/remote/mapService/response/FilterDiet;)V", 0);
                break;
            case 23:
                super(1, obj, s2.g.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, obj, cls, str, str2, i12);
        this.f1534a = i13;
    }
}
