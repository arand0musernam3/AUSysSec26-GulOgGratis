package jm;

import com.app.tgtg.R;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.locationpicker.LocationPickerActivity;
import com.app.tgtg.model.remote.item.response.BasicItem;
import f70.g;
import f70.i;
import jb.u;
import kotlin.Pair;
import mk.c;
import mv.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f25316a;

    public b(g gVar) {
        gVar.getClass();
        this.f25316a = gVar;
    }

    public final void a(BasicItem basicItem, i iVar) {
        basicItem.getClass();
        c cVar = new c(basicItem.getInformation().mo340getItemIdFvU5WIY(), d.s(basicItem));
        cVar.f29986i = iVar;
        this.f25316a.a(cVar.a());
    }

    public final void b(String str, i iVar, String str2, String str3) {
        str.getClass();
        iVar.getClass();
        c cVar = new c(str, ItemViewActivity.class);
        cVar.f29986i = iVar;
        if (str2 != null) {
            cVar.f29984g = str2;
        }
        if (str3 != null) {
            cVar.f29981d = str3;
        }
        this.f25316a.a(cVar.a());
    }

    public final void c(i iVar) {
        iVar.getClass();
        this.f25316a.a(new f70.b(LocationPickerActivity.class, u.x(new Pair("ORIGIN", iVar)), false, false, false, 1212, null, Integer.valueOf(R.anim.slide_in_from_bottom_to_top), Integer.valueOf(R.anim.stay), false, 604));
    }
}
