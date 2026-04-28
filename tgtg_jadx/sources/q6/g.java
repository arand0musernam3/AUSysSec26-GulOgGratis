package q6;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f36191b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f36192a = new HashMap();

    static {
        HashMap map = new HashMap();
        f36191b = map;
        try {
            map.put("KeyAttribute", d.class.getConstructor(null));
            map.put("KeyPosition", i.class.getConstructor(null));
            map.put("KeyCycle", f.class.getConstructor(null));
            map.put("KeyTimeCycle", k.class.getConstructor(null));
            map.put("KeyTrigger", m.class.getConstructor(null));
        } catch (NoSuchMethodException e5) {
            Log.e("KeyFrames", "unable to load", e5);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public g(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        b bVar;
        HashMap map;
        HashMap map2;
        b kVar;
        try {
            eventType = xmlResourceParser.getEventType();
            bVar = null;
        } catch (IOException e5) {
            Log.e("KeyFrames", "Error parsing XML resource", e5);
            return;
        } catch (XmlPullParserException e11) {
            Log.e("KeyFrames", "Error parsing XML resource", e11);
            return;
        }
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (f36191b.containsKey(name)) {
                    switch (name.hashCode()) {
                        case -300573030:
                            if (!name.equals("KeyTimeCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            kVar = new k();
                            kVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(kVar);
                            bVar = kVar;
                            break;
                            break;
                        case -298435811:
                            if (!name.equals("KeyAttribute")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            kVar = new d();
                            kVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(kVar);
                            bVar = kVar;
                            break;
                            break;
                        case 540053991:
                            if (!name.equals("KeyCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            kVar = new f();
                            kVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(kVar);
                            bVar = kVar;
                            break;
                            break;
                        case 1153397896:
                            if (!name.equals("KeyPosition")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            kVar = new i();
                            kVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(kVar);
                            bVar = kVar;
                            break;
                            break;
                        case 1308496505:
                            if (!name.equals("KeyTrigger")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            kVar = new m();
                            kVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(kVar);
                            bVar = kVar;
                            break;
                            break;
                        default:
                            throw new NullPointerException("Key " + name + " not found");
                    }
                    return;
                }
                if (name.equalsIgnoreCase("CustomAttribute")) {
                    if (bVar != null && (map2 = bVar.f36081d) != null) {
                        androidx.constraintlayout.widget.b.d(context, xmlResourceParser, map2);
                    }
                } else if (name.equalsIgnoreCase("CustomMethod") && bVar != null && (map = bVar.f36081d) != null) {
                    androidx.constraintlayout.widget.b.d(context, xmlResourceParser, map);
                }
            } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                return;
            }
            eventType = xmlResourceParser.next();
        }
    }

    public final void a(p pVar) {
        ArrayList arrayList = pVar.f36297w;
        HashMap map = this.f36192a;
        ArrayList arrayList2 = (ArrayList) map.get(Integer.valueOf(pVar.f36278c));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList<b> arrayList3 = (ArrayList) map.get(-1);
        if (arrayList3 != null) {
            for (b bVar : arrayList3) {
                String str = ((ConstraintLayout.a) pVar.f36277b.getLayoutParams()).Y;
                String str2 = bVar.f36080c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    arrayList.add(bVar);
                }
            }
        }
    }

    public final void b(b bVar) {
        HashMap map = this.f36192a;
        if (!map.containsKey(Integer.valueOf(bVar.f36079b))) {
            map.put(Integer.valueOf(bVar.f36079b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(bVar.f36079b));
        if (arrayList != null) {
            arrayList.add(bVar);
        }
    }
}
