package x6;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class i extends na0.a {
    public static int A0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Font x0(FontFamily fontFamily, int i11) {
        FontStyle fontStyle = new FontStyle((i11 & 1) != 0 ? 700 : 400, (i11 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iA0 = A0(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int iA02 = A0(fontStyle, font2.getStyle());
            if (iA02 < iA0) {
                font = font2;
                iA0 = iA02;
            }
        }
        return font;
    }

    @Override // na0.a
    public final Typeface h0(Context context, w6.d dVar, Resources resources, int i11) {
        try {
            FontFamily.Builder builder = null;
            for (w6.e eVar : dVar.f43240a) {
                try {
                    Font fontBuild = new Font.Builder(resources, eVar.f43246f).setWeight(eVar.f43242b).setSlant(eVar.f43243c ? 1 : 0).setTtcIndex(eVar.f43245e).setFontVariationSettings(eVar.f43244d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(x0(fontFamilyBuild, i11).getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    @Override // na0.a
    public final Typeface i0(Context context, e7.i[] iVarArr, int i11) {
        try {
            FontFamily fontFamilyY0 = y0(iVarArr, context.getContentResolver());
            if (fontFamilyY0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyY0).setStyle(x0(fontFamilyY0, i11).getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    @Override // na0.a
    public final Typeface j0(Context context, List list, int i11) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyY0 = y0((e7.i[]) list.get(0), contentResolver);
            if (fontFamilyY0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyY0);
            for (int i12 = 1; i12 < list.size(); i12++) {
                FontFamily fontFamilyY02 = y0((e7.i[]) list.get(i12), contentResolver);
                if (fontFamilyY02 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyY02);
                }
            }
            return customFallbackBuilder.setStyle(x0(fontFamilyY0, i11).getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    @Override // na0.a
    public final Typeface k0(Context context, Resources resources, int i11, String str) {
        try {
            Font fontBuild = new Font.Builder(resources, i11).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    public final FontFamily y0(e7.i[] iVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (e7.i iVar : iVarArr) {
            if (Objects.equals(iVar.f15832a.getScheme(), "systemfont")) {
                fontBuild = z0(iVar);
            } else {
                try {
                    Uri uri = iVar.f15832a;
                    str = iVar.f15836e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e5) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
                    fontBuild = null;
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(iVar.f15834c).setSlant(iVar.f15835d ? 1 : 0).setTtcIndex(iVar.f15833b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font z0(e7.i iVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
