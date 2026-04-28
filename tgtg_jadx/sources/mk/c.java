package mk;

import android.os.Bundle;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.ItemId;
import f70.i;
import java.util.HashMap;
import jb.u;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f29979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f29985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f29986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f29987j;

    public c(String str, Class cls) {
        str.getClass();
        this.f29978a = str;
        this.f29979b = cls;
        this.f29986i = i.UNKNOWN;
        this.f29987j = true;
    }

    public final f70.b a() {
        Bundle bundleX = u.x(new Pair("ITEM_ID", ItemId.m197boximpl(this.f29978a)), new Pair("RESUME_PAYMENT_FLOW", Boolean.valueOf(this.f29982e)), new Pair("ORIGIN", this.f29986i), new Pair("DISPLAY_TYPE", this.f29981d), new Pair("FILLER_TYPE", this.f29984g), new Pair("CATEGORY_TYPE", null), new Pair("DEEPLINK_PARAMETERS_MAP", this.f29985h));
        String str = this.f29980c;
        if (str != null) {
            bundleX.putSerializable("DEEPLINK_ID", str);
        }
        return new f70.b(this.f29979b, bundleX, this.f29983f, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_ITEM_VIEW), null, null, null, this.f29987j, 472);
    }
}
