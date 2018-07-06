import serial


def clean(data):
    cleanedData = data[2:-5]
    return cleanedData


def write(data):
    file=open("data.txt",mode='a+')
    for i in range(len(data)):
        file.write(data[i])
    file.write('\n')
    file.close()


arduino = serial.Serial("/dev/ttyACM0", 9600)

while True:
    data = arduino.readline()
    print(data)
    write(clean(str(data)))