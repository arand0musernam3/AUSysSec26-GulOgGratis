package j4;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import h7.h2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s {
    public static void A(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static boolean B(Flags.BooleanFlagField booleanFlagField, int i11) {
        Boolean bool = booleanFlagField.get(i11);
        bool.getClass();
        return bool.booleanValue();
    }

    public static byte[] C(ASN1Sequence aSN1Sequence, int i11) {
        return ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i11)).getOctets();
    }

    public static byte[] D(ASN1Sequence aSN1Sequence, int i11) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i11)).getOctets());
    }

    public static float a(float f11, float f12, float f13, float f14) {
        return ((f11 - f12) * f13) + f14;
    }

    public static int b(double d3, int i11, int i12) {
        return (Double.hashCode(d3) + i11) * i12;
    }

    public static long c(long j9, long j11, long j12, long j13) {
        return (j9 * j11) + j12 + j13;
    }

    public static Object d(int i11, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i11);
    }

    public static String e() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public static String f(int i11, String str) {
        return str + i11;
    }

    public static String g(IOException iOException, StringBuilder sb2) {
        sb2.append(iOException.getMessage());
        return sb2.toString();
    }

    public static String h(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
        return sb2.toString();
    }

    public static String i(Exception exc, StringBuilder sb2) {
        sb2.append(exc.toString());
        return sb2.toString();
    }

    public static String j(Object obj, String str) {
        return str + obj;
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String l(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    public static String m(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    public static String n(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static String o(StringBuilder sb2, boolean z11, String str) {
        sb2.append(z11);
        sb2.append(str);
        return sb2.toString();
    }

    public static String p(ASN1Sequence aSN1Sequence, StringBuilder sb2) {
        sb2.append(aSN1Sequence.size());
        return sb2.toString();
    }

    public static StringBuilder q(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(simpleTypeMarker);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder r(StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str, String str2) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
        return new StringBuilder(str2);
    }

    public static StringBuilder s(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    public static KMutableProperty1 t(Class cls, String str, String str2, int i11) {
        return Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, str, str2, i11));
    }

    public static FqName u(String str, FqName fqName) {
        FqName fqNameChild = fqName.child(Name.identifier(str));
        fqNameChild.getClass();
        return fqNameChild;
    }

    public static ASN1EncodableVector v(ASN1EncodableVector aSN1EncodableVector, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        return new ASN1EncodableVector();
    }

    public static ASN1ObjectIdentifier w(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    public static x6.d x(View view, WindowInsetsCompat windowInsetsCompat) {
        view.getClass();
        windowInsetsCompat.getClass();
        x6.d dVarE = windowInsetsCompat.e(h2.h());
        dVarE.getClass();
        return dVarE;
    }

    public static void y(int i11, int i12, m3.s sVar, m3.s sVar2, boolean z11) {
        sVar.a0(i11);
        cg.j.o(sVar2, i12);
        sVar.q(z11);
    }

    public static void z(StringBuilder sb2, Integer num, String str, Integer num2, String str2) {
        sb2.append(num);
        sb2.append(str);
        sb2.append(num2);
        sb2.append(str2);
    }
}
