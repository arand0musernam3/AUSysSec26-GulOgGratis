package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z2 {
    public static final z2 zza;
    public static final z2 zzb;
    public static final z2 zzc;
    public static final z2 zzd;
    public static final z2 zze;
    public static final z2 zzf;
    public static final z2 zzg;
    public static final z2 zzh;
    public static final z2 zzi;
    public static final z2 zzj;
    public static final z2 zzk;
    public static final z2 zzl;
    public static final z2 zzm;
    public static final z2 zzn;
    public static final z2 zzo;
    public static final z2 zzp;
    public static final z2 zzq;
    public static final z2 zzr;
    private static final /* synthetic */ z2[] zzu;
    private final a3 zzs;
    private final int zzt;

    static {
        z2 z2Var = new z2("DOUBLE", 0, a3.zzd, 1);
        zza = z2Var;
        z2 z2Var2 = new z2("FLOAT", 1, a3.zzc, 5);
        zzb = z2Var2;
        a3 a3Var = a3.zzb;
        z2 z2Var3 = new z2("INT64", 2, a3Var, 0);
        zzc = z2Var3;
        z2 z2Var4 = new z2("UINT64", 3, a3Var, 0);
        zzd = z2Var4;
        a3 a3Var2 = a3.zza;
        z2 z2Var5 = new z2("INT32", 4, a3Var2, 0);
        zze = z2Var5;
        z2 z2Var6 = new z2("FIXED64", 5, a3Var, 1);
        zzf = z2Var6;
        z2 z2Var7 = new z2("FIXED32", 6, a3Var2, 5);
        zzg = z2Var7;
        z2 z2Var8 = new z2("BOOL", 7, a3.zze, 0);
        zzh = z2Var8;
        z2 z2Var9 = new z2("STRING", 8, a3.zzf, 2);
        zzi = z2Var9;
        a3 a3Var3 = a3.zzi;
        z2 z2Var10 = new z2("GROUP", 9, a3Var3, 3);
        zzj = z2Var10;
        z2 z2Var11 = new z2("MESSAGE", 10, a3Var3, 2);
        zzk = z2Var11;
        z2 z2Var12 = new z2("BYTES", 11, a3.zzg, 2);
        zzl = z2Var12;
        z2 z2Var13 = new z2("UINT32", 12, a3Var2, 0);
        zzm = z2Var13;
        z2 z2Var14 = new z2("ENUM", 13, a3.zzh, 0);
        zzn = z2Var14;
        z2 z2Var15 = new z2("SFIXED32", 14, a3Var2, 5);
        zzo = z2Var15;
        z2 z2Var16 = new z2("SFIXED64", 15, a3Var, 1);
        zzp = z2Var16;
        z2 z2Var17 = new z2("SINT32", 16, a3Var2, 0);
        zzq = z2Var17;
        z2 z2Var18 = new z2("SINT64", 17, a3Var, 0);
        zzr = z2Var18;
        zzu = new z2[]{z2Var, z2Var2, z2Var3, z2Var4, z2Var5, z2Var6, z2Var7, z2Var8, z2Var9, z2Var10, z2Var11, z2Var12, z2Var13, z2Var14, z2Var15, z2Var16, z2Var17, z2Var18};
    }

    public z2(String str, int i11, a3 a3Var, int i12) {
        this.zzs = a3Var;
        this.zzt = i12;
    }

    public static z2[] values() {
        return (z2[]) zzu.clone();
    }

    public final a3 a() {
        return this.zzs;
    }

    public final int c() {
        return this.zzt;
    }
}
