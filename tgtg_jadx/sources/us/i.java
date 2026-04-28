package us;

import android.content.res.Resources;
import com.app.tgtg.model.remote.item.response.ItemType;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Resources f41530b;

    public /* synthetic */ i(Resources resources, int i11) {
        this.f41529a = i11;
        this.f41530b = resources;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ItemType itemType = (ItemType) obj;
        switch (this.f41529a) {
            case 0:
                itemType.getClass();
                String string = this.f41530b.getString(itemType.getResId());
                string.getClass();
                return string;
            default:
                itemType.getClass();
                String string2 = this.f41530b.getString(itemType.getResId());
                string2.getClass();
                return string2;
        }
    }
}
