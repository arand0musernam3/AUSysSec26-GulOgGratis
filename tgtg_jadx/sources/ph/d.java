package ph;

import android.os.Parcelable;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BasicItem;
import dn.n;
import dn.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lh.w;
import um.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Parcelable f35341e;

    public /* synthetic */ d(Object obj, Parcelable parcelable, int i11, String str, int i12) {
        this.f35337a = i12;
        this.f35340d = obj;
        this.f35341e = parcelable;
        this.f35338b = i11;
        this.f35339c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35337a) {
            case 0:
                jd.f fVar = (jd.f) this.f35340d;
                BasicItem basicItem = (BasicItem) this.f35341e;
                fVar.getClass();
                basicItem.getClass();
                ((w) fVar.f24983b).f27834f.i(new lh.f(basicItem, this.f35338b, this.f35339c));
                break;
            default:
                u uVar = (u) this.f35340d;
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) this.f35341e;
                String strM393getItemIdFvU5WIY = baseItemMnuV2.m393getItemIdFvU5WIY();
                Integer numValueOf = Integer.valueOf(baseItemMnuV2.getAvailableStock());
                Picture coverPicture = baseItemMnuV2.getCoverPicture();
                uVar.h(new o(new n(strM393getItemIdFvU5WIY, numValueOf, coverPicture != null ? coverPicture.getPictureId() : null, baseItemMnuV2.getItemType()), null, this.f35338b, 0, this.f35339c));
                break;
        }
        return Unit.f26487a;
    }
}
