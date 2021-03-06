package com.soda.lotteryredemption

data class Prize(val code: String,val prize:String,val english:String,val tripleSevenOnly:Boolean)
val PrizeList = listOf<Prize>(
   Prize("HUN",	"新臺幣100元",	"Hundred",false),
   Prize("TWO",	"新臺幣200元",	"Two Hundred",false),
   Prize("THR",	"新臺幣300元",	"Three Hundred",false),
   Prize("FOR",	"新臺幣400元",	"Four Hundred",false),
   Prize("FIV",	"新臺幣500元",	"Five Hundred",false),
   Prize("SIX",	"新臺幣600元",	"Six Hundred",false),
   Prize("SEV",	"新臺幣700元",	"Seven Hundred",false),
   Prize("EGT",	"新臺幣800元",	"Eight Hundred",false),
   Prize("NIN",	"新臺幣900元",	"Nine Hundred",false),
   Prize("THO",	"新臺幣1,000元","One Thousand",false),
   Prize("ELE",	"新臺幣1,100元","Eleven Hundred",false),
   Prize("TWL",	"新臺幣1,200元","Twelve Hundred",false),
   Prize("TRN",	"新臺幣1,300元","Thirteen Hundred",false),
   Prize("TFH",	"新臺幣1,400元","Thousand and Four Hundred",false),
   Prize("FTN",	"新臺幣1,500元","Fifteen Hundred",false),
   Prize("STN",	"新臺幣1,600元","Sixteen Hundred",false),
   Prize("SEN",	"新臺幣1,700元","Seventeen Hundred",false),
   Prize("EGN",	"新臺幣1,800元","Eighteen Hundred",false),
   Prize("TTH",	"新臺幣2,000元","Two Thousand",false),
   Prize("TTT",	"新臺幣2,100元","Two Thousand and One Hundred",true),
   Prize("EET",	"新臺幣2,500元","Two Thousand and Five Hundred",false),
   Prize("TRT",	"新臺幣3,000元","Three Thousand",false),
   Prize("TSF",	"新臺幣3,500元","Three Thousand and Five Hundred",true),
   Prize("TTS",	"新臺幣3,600元","Three Thousand and Six Hundred",false),
   Prize("FHO",	"新臺幣4,200元","Four Thousand and Two Hundred",true),
   Prize("FCH",	"新臺幣4,500元","Four Thousand and Five Hundred",false),
   Prize("FVT",	"新臺幣5,000元","Five Thousand",false),
   Prize("FTH",	"新臺幣5,000元","Five Thousand",false),
   Prize("FTW",	"新臺幣5,200元","Fifty Two Hundred",false),
   Prize("SXT",	"新臺幣6,000元","Six Thousand",false),
   Prize("SVT",	"新臺幣7,000元","Seven Thousand",false),
   Prize("SCH",	"新臺幣7,500元","Seven Thousand and Five Hundred",false),
   Prize("ETT",	"新臺幣8,000元","Eight Thousand",false),
   Prize("ETS",	"新臺幣8,800元","Eight Thousand and Eight Hundred",false),
   Prize("NIT",	"新臺幣9,000元","Nine Thousand",false),
   Prize("TEN",	"新臺幣10,000元",	"Ten Thousand",false),
   Prize("ELT",	"新臺幣11,000元",	"Eleven Thousand",false),
   Prize("FRT",	"新臺幣14,000元",	"Fourteen Thousand",false),
   Prize("FCT",	"新臺幣15,000元",	"Fifteen Thousand",false),
   Prize("SIT",	"新臺幣16,000元",	"Sixteen Thousand",false),
   Prize("ETH",	"新臺幣18,000元",	"Eighteen Thousand",false),
   Prize("TTO",	"新臺幣20,000元",	"Twenty Thousand",false),
   Prize("TTF",	"新臺幣25,000元",	"Twenty Five Thousand",false),
   Prize("THY",	"新臺幣30,000元",	"Thirty Thousand",false),
   Prize("FTY",	"新臺幣50,000元",	"Fifty Thousand",false),
   Prize("TFT",	"新臺幣50,000元",	"Fifty Thousand",false),
   Prize("SZJ",	"新臺幣60,000元",	"Sixty Thousand",false),
   Prize("SVY",	"新臺幣70,000元",	"Seventy Thousand",false),
   Prize("ETY",	"新臺幣80,000元",	"Eighty Thousand",false),
   Prize("NTY",	"新臺幣90,000元",	"Ninety Thousand",false),
   Prize("OHD",	"新臺幣100,000元",	"One Hundred Thousand",false),
   Prize("OHK",	"新臺幣100,000元",	"One Hundred Thousand",false),
   Prize("DHT",	"新臺幣100,000元",	"One Hundred Thousand",false),
   Prize("THD",	"新臺幣300,000元",	"Three Hundred Thousand",false),
   Prize("FVH",	"新臺幣500,000元",	"Five Hundred Thousand",false),
   Prize("SXH",	"新臺幣600,000元",	"Six Hundred Thousand",false),
   Prize("SHD",	"新臺幣700,000元",	"Seven Hundred Thousand",false),
   Prize("EHD",	"新臺幣800,000元",	"Eight Hundred Thousand",false),
   Prize("OML",	"新臺幣1,000,000元",	"One Million",false),
   Prize("OMF",	"新臺幣1,500,000元",	"One Million and Five Hundred Thousand",false),
   Prize("TML",	"新臺幣2,000,000元",	"Two Million",false),
   Prize("THM",	"新臺幣3,000,000元",	"Three Million",false),
   Prize("FML",	"新臺幣5,000,000元",	"Five Million",false),
   Prize("TWM",	"新臺幣12,000,000元"	,"Twelve Million",false),
   Prize("TOP",	"頭獎"	,"Top",false)
)