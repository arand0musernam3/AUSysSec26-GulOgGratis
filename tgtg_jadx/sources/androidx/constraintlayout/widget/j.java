package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2388b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2389c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f2390d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f2391e = new SparseArray();

    public j(Context context, ConstraintLayout constraintLayout, int i11) {
        String str;
        this.f2387a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            h hVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                a(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                h hVar2 = new h(context, xml);
                                this.f2390d.put(hVar2.f2377a, hVar2);
                                hVar = hVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                i iVar = new i(context, xml);
                                if (hVar != null) {
                                    hVar.f2378b.add(iVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e5) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i11, e5);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i11, e11);
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        q qVar = new q();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlResourceParser.getAttributeName(i11);
            String attributeValue = xmlResourceParser.getAttributeValue(i11);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains(ExpiryDateInput.SEPARATOR) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                qVar.l(context, xmlResourceParser);
                this.f2391e.put(identifier, qVar);
                return;
            }
        }
    }

    public final void b(float f11, float f12, int i11) {
        int i12 = this.f2388b;
        int i13 = 0;
        ConstraintLayout constraintLayout = this.f2387a;
        SparseArray sparseArray = this.f2390d;
        if (i12 == i11) {
            h hVar = i11 == -1 ? (h) sparseArray.valueAt(0) : (h) sparseArray.get(i12);
            int i14 = this.f2389c;
            if (i14 == -1 || !((i) hVar.f2378b.get(i14)).a(f11, f12)) {
                ArrayList arrayList = hVar.f2378b;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                        break;
                    } else if (((i) arrayList.get(i13)).a(f11, f12)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                ArrayList arrayList2 = hVar.f2378b;
                if (this.f2389c == i13) {
                    return;
                }
                q qVar = i13 == -1 ? null : ((i) arrayList2.get(i13)).f2386f;
                if (i13 != -1) {
                    int i15 = ((i) arrayList2.get(i13)).f2385e;
                }
                if (qVar == null) {
                    return;
                }
                this.f2389c = i13;
                qVar.b(constraintLayout);
                return;
            }
            return;
        }
        this.f2388b = i11;
        h hVar2 = (h) sparseArray.get(i11);
        ArrayList arrayList3 = hVar2.f2378b;
        while (true) {
            if (i13 >= arrayList3.size()) {
                i13 = -1;
                break;
            } else if (((i) arrayList3.get(i13)).a(f11, f12)) {
                break;
            } else {
                i13++;
            }
        }
        ArrayList arrayList4 = hVar2.f2378b;
        q qVar2 = i13 == -1 ? hVar2.f2380d : ((i) arrayList4.get(i13)).f2386f;
        if (i13 != -1) {
            int i16 = ((i) arrayList4.get(i13)).f2385e;
        }
        if (qVar2 != null) {
            this.f2389c = i13;
            qVar2.b(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i11 + ", dim =" + f11 + ", " + f12);
    }
}
