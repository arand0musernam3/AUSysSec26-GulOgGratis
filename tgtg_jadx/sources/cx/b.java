package cx;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import fx.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13460a = new b();

    public static final ArrayList a(View view) {
        if (yx.a.f46339a.contains(b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupI = h.i(view);
            if (viewGroupI != null) {
                for (View view2 : h.b(viewGroupI)) {
                    if (view != view2) {
                        arrayList.addAll(f13460a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            yx.a.a(b.class, th2);
            return null;
        }
    }

    public static final ArrayList b(View view) {
        if (yx.a.f46339a.contains(b.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(h.h(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    resourceName.getClass();
                    String[] strArr = (String[]) new Regex(ExpiryDateInput.SEPARATOR).g(0, resourceName).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    lowerCase.getClass();
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            yx.a.a(b.class, th2);
            return null;
        }
    }

    public static final boolean d(ArrayList arrayList, ArrayList arrayList2) {
        if (!yx.a.f46339a.contains(b.class)) {
            try {
                arrayList.getClass();
                arrayList2.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    b bVar = f13460a;
                    if (!yx.a.f46339a.contains(bVar)) {
                        try {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (StringsKt.z(str, (String) it2.next(), false)) {
                                    return true;
                                }
                            }
                        } catch (Throwable th2) {
                            yx.a.a(bVar, th2);
                        }
                    }
                }
            } catch (Throwable th3) {
                yx.a.a(b.class, th3);
                return false;
            }
        }
        return false;
    }

    public final ArrayList c(View view) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    lowerCase.getClass();
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator it = h.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c((View) it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }
}
